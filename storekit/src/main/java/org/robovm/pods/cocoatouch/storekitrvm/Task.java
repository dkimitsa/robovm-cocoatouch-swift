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


import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.apple.foundation.*;

/**
 * @since Available in iOS 13.0 and later.
 */
@Library(Library.INTERNAL) @NativeClass("StoreKitRvm.RvmTask")
public class Task extends NSObject {
    static { ObjCRuntime.bind(Task.class); }

    protected Task() {}
    protected Task(Handle h, long handle) { super(h, handle); }
    protected Task(SkipInit skipInit) { super(skipInit); }

    @Method(selector = "cancel")
    public native void cancel();
}
