package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ACMHotel implements Solution_Interface {
    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int count = Integer.parseInt(br.readLine());
            List<String> hotel_info = new ArrayList<>();

            for(int i=0; i<count; i++ ) {
                hotel_info.add(br.readLine());
            }

            hotel_info.stream().forEach(a -> System.out.println(room_assignments(a)));

        }catch(Exception e) {}


    }

    public String room_assignments(String info) {

        String[] hotel_info = info.split(" ");

        double floor = Double.parseDouble(hotel_info[0]);
        double guest = Double.parseDouble(hotel_info[2]);

        int ho_number = (int)Math.ceil(guest/floor);
        int floor_number = (guest%floor)==0 ? (int)floor : (int) (guest%floor) ;

        String result = floor_number+"";
        if(ho_number<10) result += "0";
        result+=ho_number;

        return result;

    }

}
