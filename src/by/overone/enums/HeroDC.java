package by.overone.enums;

public enum HeroDC {
      SUPERMAN("power"), BATMAN ("money");
      String pow;

      HeroDC(String pow) {
            this.pow = pow;
      }
      public String isPower(){
            switch (this) {
                  case SUPERMAN -> {return SUPERMAN.pow;}
                  case BATMAN -> {return BATMAN.pow;}
            }

            return null;
      }

/*
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        public boolean isWeekend() {
            switch (this) {
                case SUNDAY:
                case SATURDAY:
                    return true;
                default:
                    return false;
            }
        }
*/
//System.out.println( Day.MONDAY + " isWeekEnd(): " + Day.MONDAY.isWeekend() );



}
