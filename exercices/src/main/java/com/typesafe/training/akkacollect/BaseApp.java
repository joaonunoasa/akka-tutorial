package com.typesafe.training.akkacollect;

import akka.actor.ActorSystem;
import scala.Console;

public abstract class BaseApp {

    protected void run(String[] args) throws Exception {
        String name = "akkollect";
        ActorSystem system = ActorSystem.create(name + "-system");
        final SettingsImpl settings = Settings.Extension.get(system);

        system.log().warning("{} running - Enter "
                + Console.BLUE() + "commands" + Console.RESET()
                + " into the terminal: "
                + Console.BLUE() + "[e.g. `s` or `shutdown`]" + Console.RESET(), getClass().getSimpleName());
    }
}