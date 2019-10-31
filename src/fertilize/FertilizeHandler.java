package fertilize;

public abstract class FertilizeHandler {
	
	protected FertilizeHandler successor = null;
    /**
    	ȡֵ����
     */
    public FertilizeHandler getSuccessor() {
        return successor;
    }
    /**
     	* ������һ����������Ķ���
     */
    public void setSuccessor(FertilizeHandler successor) {
        this.successor = successor;
    }
    /**
     	* ����۲ͷ��õ�����
     * @param  fertilizer   ����
     * @return        �ɹ���ʧ�ܵľ���֪ͨ
     */
    public abstract String handleRequest(String fertilizer);
}
