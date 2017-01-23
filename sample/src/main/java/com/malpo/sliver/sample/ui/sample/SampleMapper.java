package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.base.Mapper;
import com.malpo.sliver.sample.models.Message;

final class SampleMapper implements Mapper<Message, SampleViewModel> {

    @Override
    public final SampleViewModel map(Message message) {
        return new SampleViewModel(message.getTitle(), message.getBody());
    }
}
