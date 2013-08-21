package com.sso.generalseguros.captcha;

import com.octo.captcha.module.acegi.JCaptchaServiceProxy;
import com.octo.captcha.service.CaptchaService;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;

public class JCaptchaServiceProxyImpl extends JCaptchaServiceProxy {

	public JCaptchaServiceProxyImpl(CaptchaService service) {
		super(service);
		if(service != null)
			service =  new DefaultManageableImageCaptchaService();
	}
	
	public JCaptchaServiceProxyImpl(){
		this(new DefaultManageableImageCaptchaService());
	}

}
