package c56;

public class EnumDemo1 {
	public Directions dir;

	{
		   Directions dir;
	}
		   public EnumDemo1(Directions dir) {
		      this.dir = dir;
		   }
		   public void getMyDirection() {
		     switch (dir) {
		       case EAST:
		          System.out.println("In East Direction");
		          break;
		                    
		       case WEST:
		          System.out.println("In West Direction");
		          break;
		                         
		       case NORTH: 
		          System.out.println("In North Direction");
		          break;
		                        
		       default:
		          System.out.println("In South Direction");
		          break;
		     }
		   }
		    
		    public static void main(String[] args) {
		        EnumDemo1 obj1 = new EnumDemo1(Directions.EAST);
		        obj1.getMyDirection();
		        EnumDemo1 obj2 = new EnumDemo1(Directions.SOUTH);
		        obj2.getMyDirection();
		    }
		}