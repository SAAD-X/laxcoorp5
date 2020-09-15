public class Box {

	private double length;
	
	private double width;
	
	private double height;
	
	private double volume;
	
	
	   //Getter
	   public double getLength() 
	   {
	     return length;
	   }

	   // Setter
	   public void setLength(double newLength) 
	   {
	     this.length = newLength;
	   }
	   
	   // Getter
	   public double getWidth()
	   {
		   return width;
	   }
	   
	   //Setter
	   public void setWidth(double newWidth)
	   {
		   this.width = newWidth;
	   }
	   
	  //Getter
	   public double getHeight()
	   {
		   return height;
	   }
	   
	   //Setter
	   public void setHeight(double newHeight)
	   {
		   this.height = newHeight;
	   }
	   
	   //Getter
	   public double getVolume() 
	   {
	     return volume;
	   }

	   // Setter
	   public void setVolume(double newVolume) 
	   {
	     this.volume = newVolume;
	   }
	   
	   public Box(double l , double w , double h)
		{
		   length = l;
		   width  = w;
		   height = h;
		   volume = l * w * h ;
		}
		public void displayVolume()
		{
			System.out.println("Volume is : " +volume);
			
		}
	   public static void main(String[ ] args) {
		    
			Box bx1=new 
			Box(100 , 10 ,10);
			bx1.displayVolume();
		  }


}
