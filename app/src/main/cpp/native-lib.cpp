#include <jni.h>
#include <opencv2/opencv.hpp>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_flamapp_1ai_1assignment_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    cv::Mat test = cv::Mat::zeros(200, 200, CV_8UC3);

    std::string message =
            "OpenCV Loaded Successfully! Mat: " +
            std::to_string(test.rows) + "x" +
            std::to_string(test.cols);

    return env->NewStringUTF(message.c_str());
}