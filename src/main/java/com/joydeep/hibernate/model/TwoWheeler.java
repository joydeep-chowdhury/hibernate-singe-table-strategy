package com.joydeep.hibernate.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle 
      {
          private String steeringHandle;
          public TwoWheeler() {}
		public TwoWheeler(String steeringHandle) {
			super();
			this.steeringHandle = steeringHandle;
		}
		public String getSteeringHandle() {
			return steeringHandle;
		}
		public void setSteeringHandle(String steeringHandle) {
			this.steeringHandle = steeringHandle;
		}
		@Override
		public String toString() {
			return "TwoWheeler [steeringHandle=" + steeringHandle + "]";
		}
          
          
      }
