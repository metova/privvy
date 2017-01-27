package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.Mapper;
import com.malpo.sliver.sample.models.DescriptiveNumber;

final class ListMapper extends Mapper<DescriptiveNumber, ListViewModel> {

    @Override
    public final ListViewModel map(DescriptiveNumber descriptiveNumber) {
        return ListViewModel.create(descriptiveNumber.value, descriptiveNumber.description);
    }
}
