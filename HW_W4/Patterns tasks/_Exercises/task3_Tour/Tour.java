package _Exercises.task3_Tour;

public class Tour {
    private boolean transferToAirport;
    private boolean transferFromAirport;
    private boolean flightTo;
    private boolean flightFrom;
    private boolean hostelBooking;
    private boolean insurance;

    private Tour() {}

    public class Builder {
        private Builder() {}

        public Builder setTransferToAirport(boolean transferToAirport) {
            Tour.this.transferToAirport = transferToAirport;
            return this;
        }
        public Builder setTransferFromAirport(boolean transferFromAirport) {
            Tour.this.transferFromAirport = transferFromAirport;
            return this;
        }
        public Builder setFlightTo(boolean flightTo) {
            Tour.this.flightTo = flightTo;
            return this;
        }
        public Builder setFlightFrom(boolean flightFrom) {
            Tour.this.flightFrom = flightFrom;
            return this;
        }
        public Builder setHostelBooking(boolean hostelBooking) {
            Tour.this.hostelBooking = hostelBooking;
            return this;
        }
        public Builder setInsurance(boolean insurance) {
            Tour.this.insurance = insurance;
            return this;
        }

        public Tour build() {
            return Tour.this;
        }
    }

    public static Builder buildTour() {
        return new Tour().new Builder();
    }

    public boolean isTransferToAirport() {
        return transferToAirport;
    }
    public void setTransferToAirport(boolean transferToAirport) {
        this.transferToAirport = transferToAirport;
    }
    public boolean isTransferFromAirport() {
        return transferFromAirport;
    }
    public void setTransferFromAirport(boolean transferFromAirport) {
        this.transferFromAirport = transferFromAirport;
    }
    public boolean isFlightTo() {
        return flightTo;
    }
    public void setFlightTo(boolean flightTo) {
        this.flightTo = flightTo;
    }
    public boolean isFlightFrom() {
        return flightFrom;
    }
    public void setFlightFrom(boolean flightFrom) {
        this.flightFrom = flightFrom;
    }
    public boolean isHostelBooking() {
        return hostelBooking;
    }
    public void setHostelBooking(boolean hostelBooking) {
        this.hostelBooking = hostelBooking;
    }
    public boolean isInsurance() {
        return insurance;
    }
    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transferToAirport=" + transferToAirport +
                ", transferFromAirport=" + transferFromAirport +
                ", flightTo=" + flightTo +
                ", flightFrom=" + flightFrom +
                ", hostelBooking=" + hostelBooking +
                ", insurance=" + insurance +
                '}';
    }
}
