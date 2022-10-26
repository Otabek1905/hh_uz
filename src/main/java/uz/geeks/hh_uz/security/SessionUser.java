package uz.geeks.hh_uz.security;



import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

//@Component
//public record SessionUser(HttpServletRequest request) {
//    public Users getDbUser() {
//        Users user = null;
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (Objects.nonNull(authentication)) {
//            if (authentication.getPrincipal() instanceof Users) {
//                user = (Users) authentication.getPrincipal();
//            }
//        }
//        return user;
//    }
//
//    public String getSessionUserName() {
//        return SecurityContextHolder.getContext().getAuthentication().getName();
//    }
//}
