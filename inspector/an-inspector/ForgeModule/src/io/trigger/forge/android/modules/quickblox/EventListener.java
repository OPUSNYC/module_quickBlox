package io.trigger.forge.android.modules.quickblox;

import io.trigger.forge.android.core.ForgeApp;
import io.trigger.forge.android.core.ForgeEventListener;

public class EventListener extends ForgeEventListener {
	@Override
	public void onRestart() {
		ForgeApp.event("quickblox.resume", null);
	}
}
