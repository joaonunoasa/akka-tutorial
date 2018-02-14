package com.typesafe.training.akkacollect;

import akka.actor.AbstractExtensionId;
import akka.actor.ExtendedActorSystem;
import akka.actor.ExtensionIdProvider;

public class Settings extends AbstractExtensionId<SettingsImpl> implements ExtensionIdProvider {

    public final static Settings Extension = new Settings();

    private Settings() {}

    public Settings lookup() {
        return Settings.Extension; //The public static final
    }

    public SettingsImpl createExtension(ExtendedActorSystem system) {
        return new SettingsImpl(system);
    }
}
