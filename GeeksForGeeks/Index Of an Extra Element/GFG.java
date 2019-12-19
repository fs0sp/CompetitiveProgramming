class GfG
{
	public int findExtra(int a[],int b[],int n)
        {
         // add code here.
         
            int i=0;
            
            try {
                while(a[i] == b[i]) {
                    i++;
                }
            }
            
            catch(ArrayIndexOutOfBoundsException e) {
                return i;
            }
            return i;
             
        
        }
}