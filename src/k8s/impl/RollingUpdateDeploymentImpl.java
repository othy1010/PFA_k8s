/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.RollingUpdateDeployment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rolling Update Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.RollingUpdateDeploymentImpl#getMaxUnavailable <em>Max Unavailable</em>}</li>
 *   <li>{@link k8s.impl.RollingUpdateDeploymentImpl#getMaxSurge <em>Max Surge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RollingUpdateDeploymentImpl extends MinimalEObjectImpl.Container implements RollingUpdateDeployment {
	/**
	 * The default value of the '{@link #getMaxUnavailable() <em>Max Unavailable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnavailable()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_UNAVAILABLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxUnavailable() <em>Max Unavailable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnavailable()
	 * @generated
	 * @ordered
	 */
	protected int maxUnavailable = MAX_UNAVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSurge() <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSurge()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SURGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSurge() <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSurge()
	 * @generated
	 * @ordered
	 */
	protected int maxSurge = MAX_SURGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollingUpdateDeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.ROLLING_UPDATE_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxUnavailable() {
		return maxUnavailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUnavailable(int newMaxUnavailable) {
		int oldMaxUnavailable = maxUnavailable;
		maxUnavailable = newMaxUnavailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE, oldMaxUnavailable, maxUnavailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSurge() {
		return maxSurge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSurge(int newMaxSurge) {
		int oldMaxSurge = maxSurge;
		maxSurge = newMaxSurge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE, oldMaxSurge, maxSurge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE:
				return getMaxUnavailable();
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE:
				return getMaxSurge();
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
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE:
				setMaxUnavailable((Integer)newValue);
				return;
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE:
				setMaxSurge((Integer)newValue);
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
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE:
				setMaxUnavailable(MAX_UNAVAILABLE_EDEFAULT);
				return;
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE:
				setMaxSurge(MAX_SURGE_EDEFAULT);
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
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE:
				return maxUnavailable != MAX_UNAVAILABLE_EDEFAULT;
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE:
				return maxSurge != MAX_SURGE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (maxUnavailable: ");
		result.append(maxUnavailable);
		result.append(", maxSurge: ");
		result.append(maxSurge);
		result.append(')');
		return result.toString();
	}

} //RollingUpdateDeploymentImpl
