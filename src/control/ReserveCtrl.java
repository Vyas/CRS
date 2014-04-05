package control;

import java.util.ArrayList;

import operate.Reserve;

public class ReserveCtrl {
	private static Reserve dummy = null;

	public Reserve createReserve(Reserve reserve){
		dummy = reserve;
		dummy.reserveId = 1;
		dummy.reservationNumber = "R00001";
		return dummy;
	}
	public boolean updateReserve(Reserve reserve){	//modify & cancel
		if(reserve!=null){
			dummy = reserve;
			return true;
		}else{
			return false;
		}
	}
	public boolean deleteReserve(int reserveId){
		if(reserveId!=dummy.reserveId){
			dummy = null;
			return true;
		}else{
			return false;
		}
	}
	public Reserve getReserve(int reserveId){
		if(reserveId==dummy.reserveId){
			return dummy;
		}else{
			return null;
		}
	}
	public Reserve getReserve(String ReservationNumber){
		if(dummy!=null && dummy.reservationNumber!=null && dummy.reservationNumber.compareTo(ReservationNumber)==0){
			return dummy;
		}else{
			return null;
		}
	}
	public ArrayList<Reserve> searchReserve(Reserve reserve){
		return null;
	}	
}
