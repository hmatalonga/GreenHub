/*
 * Copyright (c) 2016 Hugo Matalonga & João Paulo Fernandes
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

package hmatalonga.greenhub.models.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Network Statistics data definition.
 */
@Table(name = "NetworkStatistics")
public class NetworkStatistics extends Model {

    // Amount of wifi data received
    @Column(name = "WifiReceived")
    public double wifiReceived;

    // Amount of wifi data sent
    @Column(name = "WifiSent")
    public double wifiSent;

    // Amount of mobile data received
    @Column(name = "MobileReceived")
    public double mobileReceived;

    // Amount of mobile data sent
    @Column(name = "MobileSent")
    public double mobileSent;

    public NetworkStatistics() {
        super();
    }
}
