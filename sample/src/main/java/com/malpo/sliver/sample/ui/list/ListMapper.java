package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.Mapper;
import com.malpo.sliver.sample.models.DescriptiveNumber;

class ListMapper extends Mapper<DescriptiveNumber, ListViewModel> {

    @Override
    public ListViewModel map(DescriptiveNumber descriptiveNumber) {
        return new ListViewModel(descriptiveNumber.value, descriptiveNumber.description);
    }
}
