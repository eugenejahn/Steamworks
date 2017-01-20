public class climber {

		private VictorSP  ClimbVictor;
		
		
		public climb(int VictorPort) {
			ClimbVictor = new VictorSP(VictorPort);
			
		}
		
		public void updateSpeed(double[] JoystickInfo) {
			double x = JoystickInfo[0];
			double y = JoystickInfo[1];
			
			ClimbVictor.set( (y - x) * .50); 
				 
			
		
			
			}
		}
		


}
