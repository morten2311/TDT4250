/**
 */
package course_desc.impl;

import course_desc.CourseWork;
import course_desc.CourseWorkType;
import course_desc.Course_descPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.CourseWorkImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link course_desc.impl.CourseWorkImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link course_desc.impl.CourseWorkImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link course_desc.impl.CourseWorkImpl#isIsRestricted <em>Is Restricted</em>}</li>
 *   <li>{@link course_desc.impl.CourseWorkImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseWorkImpl extends MinimalEObjectImpl.Container implements CourseWork {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected String room = ROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRestricted() <em>Is Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRestricted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESTRICTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRestricted() <em>Is Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRestricted()
	 * @generated
	 * @ordered
	 */
	protected boolean isRestricted = IS_RESTRICTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseWorkType TYPE_EDEFAULT = CourseWorkType.LABHOUR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CourseWorkType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseWorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.COURSE_WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_WORK__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(String newRoom) {
		String oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_WORK__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_WORK__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRestricted() {
		return isRestricted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRestricted(boolean newIsRestricted) {
		boolean oldIsRestricted = isRestricted;
		isRestricted = newIsRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_WORK__IS_RESTRICTED, oldIsRestricted, isRestricted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWorkType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CourseWorkType newType) {
		CourseWorkType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_WORK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.COURSE_WORK__DURATION:
				return getDuration();
			case Course_descPackage.COURSE_WORK__ROOM:
				return getRoom();
			case Course_descPackage.COURSE_WORK__IS_MANDATORY:
				return isIsMandatory();
			case Course_descPackage.COURSE_WORK__IS_RESTRICTED:
				return isIsRestricted();
			case Course_descPackage.COURSE_WORK__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.COURSE_WORK__DURATION:
				setDuration((Integer)newValue);
				return;
			case Course_descPackage.COURSE_WORK__ROOM:
				setRoom((String)newValue);
				return;
			case Course_descPackage.COURSE_WORK__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case Course_descPackage.COURSE_WORK__IS_RESTRICTED:
				setIsRestricted((Boolean)newValue);
				return;
			case Course_descPackage.COURSE_WORK__TYPE:
				setType((CourseWorkType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.COURSE_WORK__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Course_descPackage.COURSE_WORK__ROOM:
				setRoom(ROOM_EDEFAULT);
				return;
			case Course_descPackage.COURSE_WORK__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case Course_descPackage.COURSE_WORK__IS_RESTRICTED:
				setIsRestricted(IS_RESTRICTED_EDEFAULT);
				return;
			case Course_descPackage.COURSE_WORK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.COURSE_WORK__DURATION:
				return duration != DURATION_EDEFAULT;
			case Course_descPackage.COURSE_WORK__ROOM:
				return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
			case Course_descPackage.COURSE_WORK__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case Course_descPackage.COURSE_WORK__IS_RESTRICTED:
				return isRestricted != IS_RESTRICTED_EDEFAULT;
			case Course_descPackage.COURSE_WORK__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Duration: ");
		result.append(duration);
		result.append(", Room: ");
		result.append(room);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(", isRestricted: ");
		result.append(isRestricted);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CourseWorkImpl
