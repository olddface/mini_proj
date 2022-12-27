public class Evaluate {
	public void eval(String s) {
		int a = s.length(),k , k2 = 0, ke, total = 1, totalO = 1;
		for(int i = 0; i < a; i++) {
			if(s.charAt(i) == '+' || s.charAt(i) == '-') {
				totalO+=1;total += 1;/*for indexing value of an array 
				so that it will not waste your memory */
			}
		}
		int ev[];k=0;
		ev = new int[a*total];
		char operator[];
		operator = new char[totalO-1];
		for (int i=0;i < a;i++) {
			String on = "";
			if(s.charAt(i) == '+' || s.charAt(i) == '-') {
				operator[k2] = s.charAt(i);
				k2++;
				ke = 0;
				for(int j = (i-1); j >= 0;j--) {
					
					if(s.charAt(j) == '+' || s.charAt(j) == '-') {
						on = "";
						break;
					}
					on += String.valueOf(s.charAt(ke));
					ke++;
				}
				if(on == "") {}
				else {
					ev[k] = Integer.valueOf(on);
					k++;
				}
				on = "";
				for(int j2 = (i+1); j2 < a;j2++) {
					if(s.charAt(j2) == '+' || s.charAt(j2) == '-') {
						ev[k] = Integer.valueOf(on);
						on = "";
						k++;
						continue;
					}
					on += String.valueOf(s.charAt(j2)); 
				}
				ev[k] = Integer.valueOf(on);k++; 
    		}
			
		}
		for(int it = 0; it < operator.length;it++) {
			if(operator[it] == '+') {
				ev[0] = ev[0] + ev[it+1];
			}
			if(operator[it] == '-') {
				ev[0] = ev[0] - ev[it+1];
			}
		}System.out.print(ev[0]);
			
	    }
	public static void main(String[] args) {
		Evaluate jon = new Evaluate();
		jon.eval("2-3-4-3+9");//an example
	}//output will be 1 that is the answer of operation above
}
