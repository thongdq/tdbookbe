package td.book.tdbook.security.oauth;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import td.book.tdbook.model.User;
import td.book.tdbook.repository.UserRepository;
import td.book.tdbook.security.oauth.exception.OAuth2AuthenticationProcessingException;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    // @Autowired
    // private UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest oAuth2UserRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(oAuth2UserRequest);

        try {
            return processOAuth2User(oAuth2UserRequest, oAuth2User);
        } catch(AuthenticationException ex) {
            throw ex;
        } catch(Exception e) {
            // Throwing an instance of AuthenticationException will trigger the OAuth2AuthenticationFailureHandler
            throw new InternalAuthenticationServiceException(e.getMessage(), e.getCause());
        }
    }

    private OAuth2User processOAuth2User(OAuth2UserRequest oAuth2UserRequest, OAuth2User oAuth2User) {
        // OAuth2UserInfo oAuth2UserInfo = OAuth2UserInfoFactory.getOAuth2UserInfo(
        //     oAuth2UserRequest.getClientRegistration().getRegistrationId(), oAuth2User.getAttributes());

        // if(StringUtils.isEmpty(oAuth2UserInfo.getEmail())) {
        //     throw new OAuth2AuthenticationProcessingException("Email not found from OAuth2 provider");
        // }

        // Optional<User> uOptional = userRepository.findByEmail(oAuth2UserInfo.getEmail());
        // User user;
        // if(uOptional.isPresent()) {
        //     user = uOptional.get();
        //     if(user.getProvider() == null) {
        //         user = updateExistingUser(user, oAuth2UserInfo, oAuth2UserRequest.getClientRegistration().getRegistrationId());
        //     } else if(!user.getProvider().equals(AuthProvider.valueOf(oAuth2UserRequest.getClientRegistration().getRegistrationId()))) {
        //         throw new OAuth2AuthenticationProcessingException("Looks like you're signed up with " +
        //             user.getProvider() + " account. Please use your " + user.getProvider() +
        //             " account to login.");
        //     }
        //     user = updateExistingUser(user, oAuth2UserInfo, oAuth2UserRequest.getClientRegistration().getRegistrationId());
        // } else {
        //     user = registerNewUser(oAuth2UserRequest, oAuth2UserInfo);
        // }

        // return UserPrincipal.create(user, oAuth2User.getAttributes());

        return null;
    }

    private User registerNewUser(OAuth2UserRequest oAuth2UserRequest, OAuth2UserInfo oAuth2UserInfo) {
        // User user = new User();

        // user.setProvider(AuthProvider.valueOf(oAuth2UserRequest.getClientRegistration().getRegistrationId()));
        // user.setProviderId(oAuth2UserInfo.getId());
        // user.setUserName(oAuth2UserInfo.getName());
        // user.setEmail(oAuth2UserInfo.getEmail());
        // //user.setImageUrl(oAuth2UserInfo.getImageUrl());
        // return userRepository.save(user);
        return null;
    }

    private User updateExistingUser(User existingUser, OAuth2UserInfo oAuth2UserInfo, String provider) {
        // //existingUser.setUserName(oAuth2UserInfo.getName());
        // existingUser.setProvider(AuthProvider.valueOf(provider));
        // //existingUser.setEmailVerified(oAuth2UserInfo.get);
        // return userRepository.save(existingUser);
        return null;
    }

}
