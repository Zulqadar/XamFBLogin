﻿using Foundation;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using UIKit;
using Xamarin.Forms.Platform.iOS;
using Xamarin.Forms;
using XamFBLogin;
using XamFBLogin.iOS;

[assembly: ExportRenderer(typeof(FacebookLoginButton), typeof(FacebookLoginButtonRenderer))]
namespace XamFBLogin.iOS
{
    public class FacebookLoginButtonRenderer : ViewRenderer
    {
        bool disposed;

        //protected override void OnElementChanged(ElementChangedEventArgs<View> e)
        //{
        //    base.OnElementChanged(e);
        //    if (Control == null)
        //    {
        //        var fbLoginBtnView = e.NewElement as FacebookLoginButton;
        //        var fbLoginbBtnCtrl = new LoginButton
        //        {
        //            Permissions = fbLoginBtnView.Permissions
        //        };

        //        fbLoginbBtnCtrl.Completed += AuthCompleted;

        //        SetNativeControl(fbLoginbBtnCtrl);
        //    }
        //}

        //void AuthCompleted(object sender, LoginButtonCompletedEventArgs args)
        //{
        //    var view = (this.Element as FacebookLoginButton);
        //    if (args.Error != null)
        //    {
        //        // Handle if there was an error
        //        view.OnError?.Execute(args.Error.ToString());

        //    }
        //    else if (args.Result.IsCancelled)
        //    {
        //        // Handle if the user cancelled the login request
        //        view.OnCancel?.Execute(null);
        //    }
        //    else
        //    {
        //        // Handle your successful login
        //        view.OnSuccess?.Execute(args.Result.Token.TokenString);
        //    }
        //}

        //protected override void Dispose(bool disposing)
        //{
        //    if (disposing && !this.disposed)
        //    {
        //        if (this.Control != null)
        //        {
        //            (this.Control as LoginButton).Completed -= AuthCompleted;
        //            this.Control.Dispose();
        //        }
        //        this.disposed = true;
        //    }
        //    base.Dispose(disposing);
        //}
    }
}