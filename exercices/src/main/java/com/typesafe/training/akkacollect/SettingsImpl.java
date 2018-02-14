package com.typesafe.training.akkacollect;

import akka.actor.ExtendedActorSystem;
import akka.actor.Extension;
import com.typesafe.config.Config;

public class SettingsImpl implements Extension {

    public final Config akkollect;

    public SettingsImpl(ExtendedActorSystem system) {
        akkollect = system.settings().config().getConfig("akkollect");
    }
}
