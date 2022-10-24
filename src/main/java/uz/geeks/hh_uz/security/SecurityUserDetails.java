//package uz.geeks.hh_uz.security;
//
//import lombok.Builder;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import uz.geeks.hh_uz.domains.AuthRole;
//import uz.geeks.hh_uz.domains.User;
//import java.util.Collection;
//
//@Builder
//public record SecurityUserDetails(User user) implements UserDetails {
////    @Override
////    public Collection<? extends GrantedAuthority> getAuthorities() {
////        return user.getUserRoles()
////                .stream()
////                .map(AuthRole::getAuthority)
////                .distinct()
////                .map(role -> new SimpleGrantedAuthority(role))
////                .toList();
////    }
//
//    @Override
//    public String getPassword() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}
