package com.luckyryan.sample.transformer;

import com.luckyryan.sample.dao.model.User;
import com.luckyryan.sample.dto.SignupForm;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class UserTransformer {

    private DozerBeanMapper mapper = new DozerBeanMapper();

    public User signupFormToUser(SignupForm signupForm) {
        User user = mapper.map(signupForm, User.class);
        return user;
    }

    public SignupForm userToSignupForm(User user) {
        SignupForm signupForm = mapper.map(user, SignupForm.class);
        return signupForm;
    }

}
