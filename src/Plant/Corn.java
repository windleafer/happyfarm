package Plant;

public class Corn extends Plant{
    public Corn(){
        ps = null;
        Type = "Corn";
        GrowthValue = 0;
        LivingState = "Immature";
        HealthValue = 100;
    }

    public void Growing(){
        if (this.GrowthValue < 100 && this.HealthValue > 0) {
            this.GrowthValue += 10;
            this.HealthValue -= 5;
        }
        else if(this.GrowthValue >= 100) {
            System.out.print(this.GrowthValue);
            System.out.print(this.HealthValue);
            System.out.print("���׳�����!!!\n");
        }
        else if(this.HealthValue < 0){
            LivingState = "Death";
            System.out.print("����������!!!\n");
        }
        SetPlantState(new Lack_N());
    }
    public void Harvested(){
        if(this.GrowthValue >= 100) {
            this.LivingState = "Mature";
            System.out.print("���׷��տ�!!!\n");
        }
        else{
            System.out.print("�𼱣����׻�û����!!!\n");
        }
    }
    public void Watering(){
        this.GrowthValue += 2;
        if (this.HealthValue < 90)
            this.HealthValue += 10;
        else
            this.HealthValue = 100;
        this.HealthValue += 10;
        System.out.print("�����ѽ�ˮ���ɳ�ֵ+2 & ����ֵ+10!!!\n");
        SetPlantState(new Lack_P());
    }
    public void Weeding(){
        this.GrowthValue += 2;
        if (this.HealthValue < 90)
            this.HealthValue += 10;
        else
            this.HealthValue = 100;
        System.out.print("�����ѳ��ݣ��ɳ�ֵ+2 & ����ֵ+10!!!\n");
        SetPlantState(new Lack_K());
    }
    public void Check(){

    }
}
