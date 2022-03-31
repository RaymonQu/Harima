public class InsuredShippingItem extends ShippingItem
{
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt)
  {
    /* TO BE IMPLEMENTED IN PART B */
  }
  
  public double getCost()
  {
    /* TO BE IMPLEMENTED IN PART C */
  }
  
  public void addMoreInsurance(double amt)
  {
    insuredAmount += amt;
  }
}