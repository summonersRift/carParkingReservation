package com.parking.Model.Notification;

import org.springframework.stereotype.Service;

import com.parking.Model.Notification.Contract.NotificationCmd;
import com.parking.Model.Notification.Contract.NotificationService;
import com.parking.Model.Notification.Contract.Notificator;
 

@Service
public class NotificationServiceImp implements NotificationService {

	

	@Override
	public void ProcessRequest() {
		Notificator notificator = new EmailNotificator();
		NotificationCmd cmd = new NotificationCmdImp(notificator);

		try {
			cmd.execute();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public Boolean validateRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
