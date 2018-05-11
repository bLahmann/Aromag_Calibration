
/**
 * Static class that simply hold the memory addresses of the ES2152 Acromag
 * See pages 73-92 of the user manual for reference
 */
class Constants {

    private final static int[] INPUT_CHANNEL_CONFIG_ADDRESS = {
            0x0003, 0x0004, 0x0005, 0x0006,
            0x0007, 0x0008, 0x0009, 0x000A,
            0x000B, 0x000C, 0x000D, 0x000E,
            0x000F, 0x0010, 0x0011, 0x0012
    };

    private final static int[] INPUT_CHANNEL_DATA_ADDRESS = {
            0x0033, 0x0034, 0x0035, 0x0036,
            0x0037, 0x0038, 0x0039, 0x003A,
            0x003B, 0x003C, 0x003D, 0x003E,
            0x003F, 0x0040, 0x0041, 0x0042};

    private final static int[] READBACK_CHANNEL_DATA_ADDRESS = {
            0x0053, 0x0054, 0x0055, 0x0056,
            0x0057, 0x0058, 0x0059, 0x005A,
            0x005B, 0x005C, 0x005D, 0x005E,
            0x005F, 0x0060, 0x0061, 0x0062};

    private final static int[] OUTPUT_CHANNEL_CONFIG_ADDRESS = {
            0x0020, 0x0021, 0x0022, 0x0023,
            0x0024, 0x0025, 0x0026, 0x0027,
            0x0028, 0x0029, 0x002A, 0x002B,
            0x002C, 0x002D, 0x002E, 0x002F
    };

    private final static int[] OUTPUT_CHANNEL_DATA_ADDRESS = {
            0x015E, 0x015F, 0x0160, 0x0161,
            0x0162, 0x0163, 0x0164, 0x0165,
            0x0166, 0x0167, 0x0168, 0x0169,
            0x016A, 0x016B, 0x016C, 0x016D
    };

    static int getInputChannelConfigAddress(int channel) {
        return INPUT_CHANNEL_CONFIG_ADDRESS[channel];
    }

    static int getInputChannelDataAddress(int channel) {
        return INPUT_CHANNEL_DATA_ADDRESS[channel];
    }

    static int getReadbackChannelDataAddress(int channel) {
        return READBACK_CHANNEL_DATA_ADDRESS[channel];
    }

    static int getOutputChannelConfigAddress(int channel) {
        return OUTPUT_CHANNEL_CONFIG_ADDRESS[channel];
    }

    static int getOutputChannelDataAddress(int channel) {
        return OUTPUT_CHANNEL_DATA_ADDRESS[channel];
    }
}
