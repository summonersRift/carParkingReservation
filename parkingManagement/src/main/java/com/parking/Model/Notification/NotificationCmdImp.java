package com.parking.Model.Notification;

import com.parking.Model.Notification.Contract.NotificationCmd;
import com.parking.Model.Notification.Contract.Notificator;


public class NotificationCmdImp implements NotificationCmd {

	Notificator notificator;

	/**
	 * @param notificator
	 */
	public NotificationCmdImp(Notificator notificator) {

		this.notificator = notificator;

	}

	/* (non-Javadoc)
	 * @see com.parking.Model.Notification.Contract.NotificationCmd#execute()
	 */
	@Override
	public void execute() throws Exception {
		notificator.notifyUSer();

	}

}
