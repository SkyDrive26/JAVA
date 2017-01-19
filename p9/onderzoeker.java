public class onderzoeker{
	
	/* Methods */
	private boolean keur(vorm[] v){
		int count = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i] == null){
				count++;
			}
		}
		if(count != 0){
			return false;
		}else{
			return true;
		}
	}
	
	public void maxinhoud(vorm[] v){
		double h = 0;
		int a = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].inhoud() > h){
				a = i;
				h = v[i].inhoud();
			}
		}
		v[a].print();
	}
	
	public void minoppervlakte(vorm[] v){
		double h = 0;
		int a = 0;
		for(int i = 0; i < v.length; i++){
			if (h != 0){
				if(v[i].oppervlakte() < h){
					a = i;
					h = v[i].oppervlakte();
				}
			}else{
				a = i;
				h = v[i].oppervlakte();
			}
		}
		v[a].print();
	}
	
	public void maxverhouding(vorm[] v){
		double[] h = {0, 0};
		int a = 0;
		for(int i = 0; i < v.length; i++){
			if(h[0] != 0){
				if(v[i].oppervlakte() < h[0] && v[i].inhoud() > h[1]){
					a = i;
					h[0] = v[i].oppervlakte();
					h[1] = v[i].inhoud();
				}
			}else{
				a = i;
				h[0] = v[i].oppervlakte();
				h[1] = v[i].inhoud();
			}
		}
		v[a].print();
	}
}