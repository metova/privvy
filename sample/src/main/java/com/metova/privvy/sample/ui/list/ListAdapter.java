package com.metova.privvy.sample.ui.list;

import com.metova.privvy.sample.R;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder>{

    private List<ListViewModel> numbers;

    private ListClickCallback callback;


    ListAdapter(ListClickCallback callback) {
        this.callback = callback;
    }

    void setNumbers(List<ListViewModel> numbers) {
        this.numbers = numbers;
        notifyDataSetChanged();
    }

    void setListItem(ListViewModel viewModel) {
        this.numbers.set(viewModel.number(), viewModel);
        notifyItemChanged(viewModel.number());
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_listitem, parent, false);
        return new ListHolder(inflatedView, callback);
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        holder.description.setText(String.valueOf(numbers.get(position).description()));
        holder.value.setText(String.valueOf(numbers.get(position).number()));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    static class ListHolder extends RecyclerView.ViewHolder {

        TextView description;
        TextView value;

        ListHolder(View itemView, ListClickCallback clickCallback) {
            super(itemView);

            itemView.setOnClickListener(v -> clickCallback.onItemClicked(getAdapterPosition()));

            description = (TextView) itemView.findViewById(R.id.listitem_descriptor);
            value = (TextView) itemView.findViewById(R.id.listitem_value);
        }

    }

    interface ListClickCallback {
        void onItemClicked(int position);
    }
}
