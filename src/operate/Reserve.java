package operate;

import java.util.ArrayList;

import vehicle.Equipment;
import vehicle.Vehicle;

public class Reserve {
	public int reserveId;
	public int customerId;
	public int staffId;
	
	public int branch;
	public Vehicle.TYPE type;
	public long pickUpTime;
	public long returnTime;
	public ArrayList<Equipment.TYPE> equipments;	//addEquipment, removeEquipment
	public Vehicle.INSURANCE insurance;
	public long reserveTime;
	public long lastUpdateTime;		//add by Elitward
	
	public long reservationNumber;	//(can be NULL in database, if not reserved in advance)
	
	public boolean create(){
		return false;
	}
	public boolean update(){
		return false;
	}
	public boolean cancel(){
		return false;
	}
	public boolean delete(){
		return false;
	}
	public ArrayList<Reserve> search(){	//construct with UNKNOWs, then search in database
		return null;
	}
	public Reserve getByReserveId(){
		return null;
	}
	public Reserve getByReservationNumber(){
		return null;
	}
}
