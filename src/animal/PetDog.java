package animal;

import Sleep.peopleSleep;

public class PetDog extends peopleSleep implements PetDogSleep{
	public PetDog() {
	}

	@Override
	public void sleep() {
		Sleep();
		System.out.println("Pet dog is sleeping with owner!");
	}
}
