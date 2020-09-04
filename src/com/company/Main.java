package com.company;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.EnrollmentModel.EnrollmentStatus.*;
import static java.time.ZoneOffset.UTC;

public class Main {


    public static void main(String[] args) {
        ZonedDateTime currentZonedDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault());
        ZonedDateTime currentUTCDateTime = currentZonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println( currentUTCDateTime);


        LocalDateTime now = LocalDateTime.now(UTC);
        System.out.println( now);
        List<EnrollmentModel> enrollmentModelList = new ArrayList<>();
      //  enrollmentModelList.add(new EnrollmentModel(INVITED));

       enrollmentModelList.add(new EnrollmentModel(INVITED));
        enrollmentModelList.add(new EnrollmentModel(CANCELLED));
        enrollmentModelList.add(new EnrollmentModel(YANCELLED));
        enrollmentModelList.add(new EnrollmentModel(ALLOWED));
        enrollmentModelList.add(new EnrollmentModel(CANCELLED));
        enrollmentModelList.add(new EnrollmentModel(CANCELLED));
      System.out.println(  enrollmentModelList.stream().filter(it -> it.getStatus().equals(CANCELLED)).count());
        //EnrollmentModel responseModel = null;
       // enrollmentModelList=   enrollmentModelList.stream().sorted(Comparator.comparing(EnrollmentModel::getStatus)).collect(Collectors.toList());
    /*    enrollmentModelList.sort((o1, o2) -> {
            EnrollmentModel.EnrollmentStatus o1Status = o1.getStatus();
            EnrollmentModel.EnrollmentStatus o2Status = o2.getStatus();

            if (o1Status.equals(o2Status)) {
                return 0;
            }

            if (CANCELLED == o1Status) {
                return -1;
            }

            return 1;
        });
*/
      //  for ( EnrollmentModel dto : enrollmentModelList) {
           // System.out.println( enrollmentModelList == null);

   //     List<String> attendedSessions = enrollmentModel.getAttendedSession(document.getTimeSlotsIds());

       // System.out.println( enrollmentModelList.isEmpty());
       // System.out.println(  enrollmentModelList.get(0) == null);

    }
      //  }

    }

