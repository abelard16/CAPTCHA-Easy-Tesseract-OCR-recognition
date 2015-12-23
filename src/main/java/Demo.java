import cn.easyproject.easyocr.EasyOCR;
import cn.easyproject.easyocr.ImageType;

/**
 * Created by zjian on 2015/11/19.
 */
public class Demo {
    public static void main(String[] args) {

        EasyOCR e = new EasyOCR();
//        e.setTesseractOptions("-l apofont");
        e.setTesseractOptions("-l eng");

//ֱ��ʶ��ͼƬ����
//        System.out.println(e.discern("images/test6.php.png"));
//ֱ��ʶ����֤��ͼƬ����
//        System.out.println(e.discernAndAutoCleanImage("images/22222.png", ImageType.CAPTCHA_INTERFERENCE_LINE));
//��֤��ͼƬ����������ͨ�����α䳡���Զ�һ�廯�����ʶ������
        System.out.println(e.discernAndAutoCleanImage("images/captcha.jpg", ImageType.CLEAR));
        System.out.println(e.discernAndAutoCleanImage("images/2222.jpg", ImageType.CAPTCHA_WHITE_CHAR));
        System.out.println(e.discernAndAutoCleanImage("images/20151117142240980.jpg", ImageType.CAPTCHA_WHITE_CHAR));
//        System.out.println(e.discernAndAutoCleanImage("images/test6.php.png",ImageType.CAPTCHA_SPOT));
    }
}

