package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.R;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder>{

    private List<ListViewModel> numbers;

    void setNumbers(List<ListViewModel> numbers) {
        this.numbers = numbers;
        notifyDataSetChanged();
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_listitem, parent, false);
        return new ListHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        holder.description.setText(String.valueOf(numbers.get(position).getDescription()));
        holder.value.setText(String.valueOf(numbers.get(position).getNumber()));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    static class ListHolder extends RecyclerView.ViewHolder {

        TextView description;
        TextView value;

        ListHolder(View itemView) {
            super(itemView);

            description = (TextView) itemView.findViewById(R.id.listitem_descriptor);
            value = (TextView) itemView.findViewById(R.id.listitem_value);
        }
    }
}
