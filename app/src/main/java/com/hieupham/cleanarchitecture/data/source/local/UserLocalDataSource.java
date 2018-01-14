package com.hieupham.cleanarchitecture.data.source.local;

import com.hieupham.cleanarchitecture.data.source.local.api.RoomApi;
import javax.inject.Inject;

/**
 * Created by hieupham on 1/13/18.
 */

public class UserLocalDataSource extends LocalDataSource {

    @Inject
    UserLocalDataSource(RoomApi roomApi) {
        super(roomApi);
    }
}
