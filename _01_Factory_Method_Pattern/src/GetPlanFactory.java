public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMECIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
