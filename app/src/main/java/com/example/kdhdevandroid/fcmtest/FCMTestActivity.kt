package com.example.kdhdevandroid.fcmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kdhdevandroid.databinding.ActivityFcmtestBinding

class FCMTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFcmtestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFcmtestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /** FCM설정, Token값 가져오기 */
        MyFCMService().getFirebaseToken()

        /** DynamicLink 수신확인 */
        initDynamicLink()
    }

    /** DynamicLink */
    private fun initDynamicLink() {
        val dynamicLinkData = intent.extras
        if (dynamicLinkData != null) {
            var dataStr = "DynamicLink 수신받은 값\n"
            for (key in dynamicLinkData.keySet()) {
                dataStr += "key: $key / value: ${dynamicLinkData.getString(key)}\n"
            }
            binding.tvToken.text = dataStr
        }
    }
}