package top.seven.dto;

import lombok.*;

import java.awt.image.BufferedImage;

/**
 * Created By Seven.wk
 * Description: 验证码实体
 * Created At 2018/11/10
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaDTO {

    // 验证码图片
    private BufferedImage captchaImage;

    // 验证码数字
    private String captchaCode;

}
