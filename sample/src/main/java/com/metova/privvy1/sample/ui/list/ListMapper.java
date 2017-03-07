package com.metova.privvy1.sample.ui.list;

import com.metova.privvy1.Mapper;
import com.metova.privvy1.sample.models.DescriptiveNumber;

final class ListMapper extends Mapper<DescriptiveNumber, ListViewModel> {

    @Override
    public final ListViewModel map(DescriptiveNumber descriptiveNumber) {
        return ListViewModel.create(descriptiveNumber.value, descriptiveNumber.description);
    }
}
