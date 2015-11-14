package com.parking.Model.Notification;

import com.parking.Model.Notification.Contract.NotificationCmd;
import com.parking.Model.Notification.Contract.Notificator;


public class NotificationCmdImp implements NotificationCmd {

	Notificator notificator;

	public NotificationCmdImp(Notificator notificator) {

		this.notificator = notificator;

	}

	@Override
	public void execute() throws Exception {
		notificator.notifyUSer();

	}

}
