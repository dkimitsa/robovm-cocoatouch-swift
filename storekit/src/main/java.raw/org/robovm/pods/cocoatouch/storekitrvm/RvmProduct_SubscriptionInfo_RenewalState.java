/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.cocoatouch.storekitrvm;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RvmProduct_SubscriptionInfo_RenewalState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RvmProduct_SubscriptionInfo_RenewalStatePtr extends Ptr<RvmProduct_SubscriptionInfo_RenewalState, RvmProduct_SubscriptionInfo_RenewalStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RvmProduct_SubscriptionInfo_RenewalState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RvmProduct_SubscriptionInfo_RenewalState() {}
    protected RvmProduct_SubscriptionInfo_RenewalState(Handle h, long handle) { super(h, handle); }
    protected RvmProduct_SubscriptionInfo_RenewalState(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "subscribed")
    public static native RvmProduct_SubscriptionInfo_RenewalState subscribed();
    @Method(selector = "expired")
    public static native RvmProduct_SubscriptionInfo_RenewalState expired();
    @Method(selector = "inBillingRetryPeriod")
    public static native RvmProduct_SubscriptionInfo_RenewalState inBillingRetryPeriod();
    @Method(selector = "inGracePeriod")
    public static native RvmProduct_SubscriptionInfo_RenewalState inGracePeriod();
    @Method(selector = "revoked")
    public static native RvmProduct_SubscriptionInfo_RenewalState revoked();
    /*</methods>*/
}
