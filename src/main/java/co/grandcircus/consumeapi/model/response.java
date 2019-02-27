package co.grandcircus.consumeapi.model;

import java.util.List;

public class response {
	
		private List<complete> complete;
		private List<tiny> tiny;
		
		public List<complete> getComplete() {
			return complete;
		}
		public void setComplete(List<complete> complete) {
			this.complete = complete;
		}
		public List<tiny> getTiny() {
			return tiny;
		}
		public void setTiny(List<tiny> tiny) {
			this.tiny = tiny;
		}

}
