package com.metova.privvy.sample.ui.list;

import com.metova.privvy.Mapper;
import com.metova.privvy.sample.models.DescriptiveNumber;

final class ListMapper extends Mapper<DescriptiveNumber, ListViewModel> {

    @Override
    public final ListViewModel map(DescriptiveNumber descriptiveNumber) {
        return ListViewModel.create(descriptiveNumber.value, descriptiveNumber.description);
    }
}
