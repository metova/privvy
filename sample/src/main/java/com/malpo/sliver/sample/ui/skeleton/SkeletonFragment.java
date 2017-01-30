//package com.malpo.sliver.sample.ui.skeleton;
//
//import com.malpo.sliver.sample.MainActivity;
//import com.malpo.sliver.sample.R;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import javax.inject.Inject;
//
//import butterknife.ButterKnife;
//
//public class SkeletonFragment extends Fragment implements SkeletonContract.View {
//
//    @Inject
//    SkeletonComponent mSkeletonComponent;
//
//    private SkeletonContract.Presenter presenter;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ((MainActivity) getActivity()).hostComponent.newSliverComponent().inject(this);
//        presenter = mSkeletonComponent.presenter();
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.main_activity, container, false);
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        ButterKnife.bind(this, view);
//        presenter.setView(this);
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        presenter.onDestroyView();
//    }
//
//}
