package OOP;

class Phone{
    private String callTo;
    private String msg;
    private String msgTo;

    public String getMsgTo() {
        return msgTo;
    }

    public void setMsgTo(String msgTo) {
        this.msgTo = msgTo;
    }

    public Phone() {
        System.out.println("I am base constructor");
    }

    public Phone(String call) {
        this.callTo = call;
        System.out.println("Calling "+ call+"...");
    }

    public Phone(String msg, String msgTo) {
        this.msg = msg;
        this.msgTo = msgTo;
        System.out.println("Sending Message '"+msg+"' to"+msgTo );
    }

    public String getCall() {
        return callTo;
    }

    public void setCall(String call) {
        this.callTo = call;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void makeCall(String callTo){
        System.out.println("Calling "+ callTo+"...");
    }
    public void sendMsg(String msg,String msgTo){
        System.out.println("Sending Message '"+ msg +"' to "+msgTo);
    }
}


public class Inheritance {

    public static void main(String[] args) {

        Phone phone=new Phone();
        phone.sendMsg("Hi! Owais","Owais");
        phone.makeCall("Uzair");

        System.out.println();

        Phone phone1=new Phone("Owais");
        phone1.makeCall(phone1.getCall());
        phone1.sendMsg("Hi! "+phone1.getCall(),phone1.getCall());

        System.out.println();

        SmartPhone smartPhone3=new SmartPhone();

        System.out.println();

       SmartPhone smartPhone=new SmartPhone(false,false,false,"Humaid");
       smartPhone.makeCall(smartPhone.getMediaSendTo());
       smartPhone.sendMsg("Hi! Humaid",smartPhone.getMediaSendTo());
       smartPhone.recordVideo();
       smartPhone.recordAudio();
       smartPhone.takeSnap();

        System.out.println();

        SmartPhone smartPhone1=new SmartPhone("owais");
        System.out.println(smartPhone1.getCall());

        System.out.println();

        SmartPhone smartPhone2=new SmartPhone("Hi!","Usaid");


    }

}
class SmartPhone extends Phone{
    private boolean takeSnap;
    private boolean recordVideo;
    private boolean recordAudio;
    private String MediaSendTo;

    public SmartPhone() {
        System.out.println("I am Drive Constructor");
    }


    public SmartPhone(String callTo){
        super(callTo);
    }

    public SmartPhone(String msg,String msgTo){
        super(msg,msgTo);
    }

    public boolean isTakeSnap() {
        return takeSnap;
    }

    public void setTakeSnap(boolean takeSnap) {
        this.takeSnap = takeSnap;
    }

    public boolean isRecordVideo() {
        return recordVideo;
    }

    public void setRecordVideo(boolean recordVideo) {
        this.recordVideo = recordVideo;
    }

    public boolean isRecordAudio() {
        return recordAudio;
    }

    public void setRecordAudio(boolean recordAudio) {
        this.recordAudio = recordAudio;
    }

    public String getMediaSendTo() {
        return MediaSendTo;
    }

    public void setMediaSendTo(String mediaSendTo) {
        MediaSendTo = mediaSendTo;
    }

    public SmartPhone(boolean  takeSnap, boolean recordAudio, boolean recordVideo, String MediaSendTo){
        this.recordAudio=recordAudio;
        this.recordVideo=recordVideo;
        this.takeSnap=takeSnap;
        this.MediaSendTo=MediaSendTo;
    }
    public void recordVideo(){
        if (isRecordVideo()){
            System.out.println("Video is Recording");
        }
        else{
            setRecordVideo(true);
            System.out.println("Video is Recording");
        }
    }
    public void recordAudio(){
        if (isRecordAudio()){
            System.out.println("Audio is Recording");
        }
        else{
            setRecordAudio(true);
            System.out.println("Audio is Recording");
        }
    }

    public void takeSnap(){
        if (isTakeSnap()){
            System.out.println("Taking Snap");
        }
        else{
            setTakeSnap(true);
            System.out.println("Taking Snap");
        }
    }


}
