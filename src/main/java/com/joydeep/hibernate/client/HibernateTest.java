package com.joydeep.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.joydeep.hibernate.model.FourWheeler;
import com.joydeep.hibernate.model.TwoWheeler;
import com.joydeep.hibernate.model.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		TwoWheeler th=new TwoWheeler();
		th.setVehicleName("Bike");
		th.setSteeringHandle("Bike Steering handle");
		FourWheeler fw=new FourWheeler();
		fw.setVehicleName("Porshe");
		fw.setSteeringWheel("Porshe Steering Wheel");
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(th);
        session.save(fw);
        session.getTransaction().commit();
        session.close();
	}

}
