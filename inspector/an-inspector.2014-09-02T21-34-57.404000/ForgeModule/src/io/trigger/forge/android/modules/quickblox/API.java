package io.trigger.forge.android.modules.quickblox;

import io.trigger.forge.android.core.ForgeApp;
import io.trigger.forge.android.core.ForgeParam;
import io.trigger.forge.android.core.ForgeTask;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class API {
	
	public static void videoChat(final ForgeTask task) {
		task.performUI(new Runnable() {
			public void run() {	    
				Intent LaunchIntent = ForgeApp.getActivity().getPackageManager().getLaunchIntentForPackage("com.quickblox.videochatsample");
				ForgeApp.getActivity().startActivity(LaunchIntent);
			}
		});
	}
	
	public static void skype(final ForgeTask task) {
		task.performUI(new Runnable() {
			public void run() {	    
				Intent LaunchIntent2 = ForgeApp.getActivity().getPackageManager().getLaunchIntentForPackage("com.skype.raider");
				ForgeApp.getActivity().startActivity(LaunchIntent2);
			}
		});
	}
	
	}
//com.quickblox.videochatsample
