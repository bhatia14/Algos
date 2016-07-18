package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class MeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time[]=new int[96];
		ArrayList<Integer> ar=new ArrayList<>();
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.print("enter start time: ");
			int timeVal=sc.nextInt();
			System.out.print("enter end time: ");
			int endTimeVal=sc.nextInt();
			
			MeetingRoom meetingRoom=new MeetingRoom();
			int startindex= meetingRoom.timeCal(timeVal);
			int endIndex=meetingRoom.timeCal(endTimeVal);
			if(startindex==-1 || endIndex==-1){
				System.out.println("Invalid timings");
				continue;
			}
			for(int i=startindex;i<=endIndex;i++){
				if(time[i]==1&& time[i+1]==1)
					System.out.println("Overlapped");
				
			}
			for(int i=startindex;i<=endIndex;i++){
				time[i]=1;
				System.out.println("Booked");
			}
			
			System.out.println("type yes for Adding more:");
			
			int v=sc.nextInt();
			if(v==1)
				break;
		}
	}
	
	public int timeCal(int timeVal){
		ArrayList<Integer> ar=new ArrayList<>();
		if(timeVal>=0 && timeVal<2359){
			while(timeVal>0){
				ar.add(timeVal%10);
				timeVal=timeVal/10;
			}
			int mm=ar.get(0)+(ar.get(1)*10);
			int hh=0;
			if(ar.size()>2){
				hh=ar.get(2)+(ar.get(3)*10);
			}
			if(mm%15!=0)
				return -1;
				
			int hhVal=hh*4;
			int mmVal=mm/15;
			int index=hhVal+mmVal;
			System.out.println(index);
			return index;
		}
		else
			System.out.println("Invalid Time entry");
		return -1;

	}

}
